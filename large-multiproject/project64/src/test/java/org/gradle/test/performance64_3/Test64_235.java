package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_235 {
    private final Production64_235 production = new Production64_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_168 {
    private final Production64_168 production = new Production64_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
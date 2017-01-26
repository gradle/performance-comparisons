package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_382 {
    private final Production64_382 production = new Production64_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
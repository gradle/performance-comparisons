package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_244 {
    private final Production64_244 production = new Production64_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_63 {
    private final Production64_63 production = new Production64_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
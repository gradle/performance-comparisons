package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_127 {
    private final Production64_127 production = new Production64_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
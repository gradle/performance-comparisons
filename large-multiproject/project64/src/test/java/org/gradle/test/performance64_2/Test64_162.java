package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_162 {
    private final Production64_162 production = new Production64_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
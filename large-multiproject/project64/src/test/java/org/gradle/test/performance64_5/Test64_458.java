package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_458 {
    private final Production64_458 production = new Production64_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
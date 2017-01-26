package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_238 {
    private final Production64_238 production = new Production64_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
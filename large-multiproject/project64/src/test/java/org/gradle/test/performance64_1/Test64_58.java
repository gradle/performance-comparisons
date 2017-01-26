package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_58 {
    private final Production64_58 production = new Production64_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
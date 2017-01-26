package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_58 {
    private final Production91_58 production = new Production91_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
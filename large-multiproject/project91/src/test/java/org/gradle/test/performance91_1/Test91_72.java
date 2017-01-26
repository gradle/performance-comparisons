package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_72 {
    private final Production91_72 production = new Production91_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
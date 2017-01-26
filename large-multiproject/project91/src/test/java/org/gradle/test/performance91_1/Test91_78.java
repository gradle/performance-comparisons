package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_78 {
    private final Production91_78 production = new Production91_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
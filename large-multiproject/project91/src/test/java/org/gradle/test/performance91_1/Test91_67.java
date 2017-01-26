package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_67 {
    private final Production91_67 production = new Production91_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
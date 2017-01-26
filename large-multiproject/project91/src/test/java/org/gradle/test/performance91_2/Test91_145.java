package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_145 {
    private final Production91_145 production = new Production91_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
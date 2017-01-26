package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_241 {
    private final Production91_241 production = new Production91_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
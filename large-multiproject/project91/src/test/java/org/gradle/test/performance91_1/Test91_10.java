package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_10 {
    private final Production91_10 production = new Production91_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
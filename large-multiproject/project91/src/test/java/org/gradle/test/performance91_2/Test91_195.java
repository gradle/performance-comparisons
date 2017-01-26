package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_195 {
    private final Production91_195 production = new Production91_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
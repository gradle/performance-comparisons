package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_388 {
    private final Production91_388 production = new Production91_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
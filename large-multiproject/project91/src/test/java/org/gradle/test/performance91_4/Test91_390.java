package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_390 {
    private final Production91_390 production = new Production91_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_62 {
    private final Production91_62 production = new Production91_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_330 {
    private final Production91_330 production = new Production91_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
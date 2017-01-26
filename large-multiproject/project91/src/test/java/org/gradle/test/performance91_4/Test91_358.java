package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_358 {
    private final Production91_358 production = new Production91_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
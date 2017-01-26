package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_40 {
    private final Production91_40 production = new Production91_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
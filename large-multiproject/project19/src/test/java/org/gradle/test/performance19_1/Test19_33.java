package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_33 {
    private final Production19_33 production = new Production19_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
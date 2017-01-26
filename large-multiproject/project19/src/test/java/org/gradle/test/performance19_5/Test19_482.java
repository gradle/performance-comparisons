package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_482 {
    private final Production19_482 production = new Production19_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
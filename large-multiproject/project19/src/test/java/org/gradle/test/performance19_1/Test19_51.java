package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_51 {
    private final Production19_51 production = new Production19_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
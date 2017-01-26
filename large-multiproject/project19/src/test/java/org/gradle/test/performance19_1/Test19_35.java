package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_35 {
    private final Production19_35 production = new Production19_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
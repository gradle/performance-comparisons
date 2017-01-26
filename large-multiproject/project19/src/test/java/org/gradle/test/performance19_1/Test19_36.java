package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_36 {
    private final Production19_36 production = new Production19_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_300 {
    private final Production19_300 production = new Production19_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
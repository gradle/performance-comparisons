package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_450 {
    private final Production19_450 production = new Production19_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
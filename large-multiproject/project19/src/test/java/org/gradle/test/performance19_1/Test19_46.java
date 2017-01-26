package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_46 {
    private final Production19_46 production = new Production19_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
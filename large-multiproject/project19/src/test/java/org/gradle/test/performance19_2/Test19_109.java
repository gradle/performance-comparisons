package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_109 {
    private final Production19_109 production = new Production19_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
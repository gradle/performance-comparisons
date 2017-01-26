package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_140 {
    private final Production19_140 production = new Production19_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
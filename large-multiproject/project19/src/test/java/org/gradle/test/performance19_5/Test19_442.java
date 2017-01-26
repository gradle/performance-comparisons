package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_442 {
    private final Production19_442 production = new Production19_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
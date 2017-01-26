package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_212 {
    private final Production19_212 production = new Production19_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
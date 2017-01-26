package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_212 {
    private final Production65_212 production = new Production65_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
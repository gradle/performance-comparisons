package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_362 {
    private final Production65_362 production = new Production65_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
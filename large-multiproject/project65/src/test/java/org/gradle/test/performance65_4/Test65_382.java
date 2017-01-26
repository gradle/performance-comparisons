package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_382 {
    private final Production65_382 production = new Production65_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_100 {
    private final Production65_100 production = new Production65_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
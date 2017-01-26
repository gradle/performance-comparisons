package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_40 {
    private final Production65_40 production = new Production65_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
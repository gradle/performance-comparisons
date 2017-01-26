package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_93 {
    private final Production65_93 production = new Production65_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_288 {
    private final Production65_288 production = new Production65_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
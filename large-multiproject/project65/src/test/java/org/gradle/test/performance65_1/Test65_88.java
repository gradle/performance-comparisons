package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_88 {
    private final Production65_88 production = new Production65_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
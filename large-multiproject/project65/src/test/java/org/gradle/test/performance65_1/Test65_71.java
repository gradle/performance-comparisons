package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_71 {
    private final Production65_71 production = new Production65_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
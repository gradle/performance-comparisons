package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_147 {
    private final Production19_147 production = new Production19_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
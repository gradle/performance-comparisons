package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_293 {
    private final Production19_293 production = new Production19_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
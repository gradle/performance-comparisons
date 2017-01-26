package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_229 {
    private final Production19_229 production = new Production19_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
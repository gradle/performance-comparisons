package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_97 {
    private final Production19_97 production = new Production19_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
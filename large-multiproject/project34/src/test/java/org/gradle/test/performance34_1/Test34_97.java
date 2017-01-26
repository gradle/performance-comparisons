package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_97 {
    private final Production34_97 production = new Production34_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
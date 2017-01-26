package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_74 {
    private final Production34_74 production = new Production34_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
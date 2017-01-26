package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_93 {
    private final Production34_93 production = new Production34_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
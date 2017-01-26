package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_166 {
    private final Production34_166 production = new Production34_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
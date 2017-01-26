package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_263 {
    private final Production34_263 production = new Production34_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
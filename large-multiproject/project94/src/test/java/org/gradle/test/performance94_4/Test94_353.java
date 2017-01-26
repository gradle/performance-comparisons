package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_353 {
    private final Production94_353 production = new Production94_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
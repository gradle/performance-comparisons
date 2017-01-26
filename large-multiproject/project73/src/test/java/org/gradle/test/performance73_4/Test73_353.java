package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_353 {
    private final Production73_353 production = new Production73_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
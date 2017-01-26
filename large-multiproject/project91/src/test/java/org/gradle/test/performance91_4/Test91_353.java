package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_353 {
    private final Production91_353 production = new Production91_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}
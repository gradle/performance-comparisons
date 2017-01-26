package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_353 {
    private final Production59_353 production = new Production59_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}